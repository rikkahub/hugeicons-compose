package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Potion: ImageVector
    get() {
        if (_potion != null) {
            return _potion!!
        }
        _potion = ImageVector.Builder(
            name = "Potion",
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
        moveTo(19f, 15f)
        curveTo(19f, 18.866f, 15.866f, 22f, 12f, 22f)
        curveTo(8.13401f, 22f, 5f, 18.866f, 5f, 15f)
        curveTo(5f, 11.134f, 8.13401f, 8f, 12f, 8f)
        curveTo(15.866f, 8f, 19f, 11.134f, 19f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 15f)
        curveTo(13f, 16.3807f, 11.8807f, 17.5f, 10.5f, 17.5f)
        curveTo(9.11929f, 17.5f, 8f, 16.3807f, 8f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.4609f, 4.98405f)
        curveTo(12.4771f, 4.82626f, 12.4804f, 4.66723f, 12.4705f, 4.50845f)
        lineTo(12.3476f, 2.53028f)
        curveTo(12.3264f, 2.18962f, 12.657f, 1.92903f, 12.9983f, 2.01736f)
        lineTo(17.6108f, 3.21118f)
        curveTo(17.9521f, 3.29951f, 18.1035f, 3.68484f, 17.9088f, 3.96964f)
        lineTo(16.7784f, 5.62342f)
        curveTo(16.6877f, 5.75616f, 16.6081f, 5.89545f, 16.5405f, 6.03991f)
        moveTo(12.4609f, 4.98405f)
        curveTo(12.4443f, 5.1461f, 12.414f, 5.30684f, 12.3702f, 5.46466f)
        lineTo(11.5176f, 8f)
        moveTo(12.4609f, 4.98405f)
        lineTo(11f, 4.60593f)
        moveTo(12.4609f, 4.98405f)
        lineTo(16.5405f, 6.03991f)
        moveTo(16.5405f, 6.03991f)
        curveTo(16.471f, 6.18829f, 16.414f, 6.34212f, 16.3702f, 6.49993f)
        lineTo(15.6587f, 9f)
        moveTo(16.5405f, 6.03991f)
        lineTo(18f, 6.41766f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 15f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.008f, 12f)
        lineTo(13.999f, 12f)
        }
        }.build()

        return _potion!!
    }

private var _potion: ImageVector? = null
