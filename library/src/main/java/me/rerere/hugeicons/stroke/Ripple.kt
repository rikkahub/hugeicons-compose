package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ripple: ImageVector
    get() {
        if (_ripple != null) {
            return _ripple!!
        }
        _ripple = ImageVector.Builder(
            name = "Ripple",
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
        moveTo(12f, 2f)
        curveTo(6.47716f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 13.5f)
        curveTo(6.5f, 15.1569f, 7.84315f, 16.5f, 9.5f, 16.5f)
        curveTo(10.5435f, 16.5f, 11.4625f, 15.9672f, 12f, 15.1589f)
        curveTo(12.5375f, 15.9672f, 13.4565f, 16.5f, 14.5f, 16.5f)
        curveTo(16.1569f, 16.5f, 17.5f, 15.1569f, 17.5f, 13.5f)
        curveTo(17.5f, 11.9523f, 16.328f, 10.6784f, 14.8232f, 10.5172f)
        curveTo(14.9376f, 10.1996f, 15f, 9.85707f, 15f, 9.5f)
        curveTo(15f, 7.84314f, 13.6569f, 6.5f, 12f, 6.5f)
        curveTo(10.3431f, 6.5f, 9f, 7.84314f, 9f, 9.5f)
        curveTo(9f, 9.85707f, 9.06238f, 10.1996f, 9.17684f, 10.5172f)
        curveTo(7.67196f, 10.6784f, 6.5f, 11.9523f, 6.5f, 13.5f)
        }
        }.build()

        return _ripple!!
    }

private var _ripple: ImageVector? = null
