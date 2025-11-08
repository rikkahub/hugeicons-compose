package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FishFood: ImageVector
    get() {
        if (_fishFood != null) {
            return _fishFood!!
        }
        _fishFood = ImageVector.Builder(
            name = "FishFood",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.00781f, 12f)
        lineTo(5.99883f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 16.0418f)
        curveTo(11.4635f, 16.1947f, 11.9076f, 16.3708f, 12.3099f, 16.6525f)
        moveTo(12.3099f, 16.6525f)
        curveTo(13.3507f, 17.3811f, 14f, 18.5764f, 14f, 19.8845f)
        curveTo(14f, 19.9484f, 13.9465f, 20.0003f, 13.8819f, 20f)
        curveTo(10.9648f, 19.9871f, 9.65844f, 19.4932f, 9.1094f, 18.6782f)
        lineTo(8f, 16.8568f)
        curveTo(5.50848f, 16.3537f, 3.21828f, 14.7625f, 2f, 12.0833f)
        curveTo(5f, 5.48589f, 14.5f, 5.48589f, 17.5f, 12.0833f)
        moveTo(12.3099f, 16.6525f)
        curveTo(14.4801f, 15.9922f, 16.4151f, 14.4692f, 17.5f, 12.0833f)
        moveTo(12.3099f, 7.5142f)
        curveTo(13.3507f, 6.78564f, 14f, 5.59024f, 14f, 4.28218f)
        curveTo(14f, 3.4556f, 9.69172f, 4.62406f, 9.1094f, 5.48846f)
        lineTo(8f, 7.30982f)
        moveTo(17.5f, 12.0833f)
        curveTo(17.8333f, 11.4236f, 19.6f, 9.11447f, 22f, 9.11447f)
        curveTo(21.1667f, 9.93915f, 19.8f, 13.0729f, 21f, 15.0522f)
        curveTo(19.8f, 15.0522f, 18f, 12.7431f, 17.5f, 12.0833f)
        }
        }.build()

        return _fishFood!!
    }

private var _fishFood: ImageVector? = null
