package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Clock05: ImageVector
    get() {
        if (_clock05 != null) {
            return _clock05!!
        }
        _clock05 = ImageVector.Builder(
            name = "Clock05",
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
        moveTo(12f, 22f)
        curveTo(6.47715f, 22f, 2.00004f, 17.5228f, 2.00004f, 12f)
        curveTo(2.00004f, 6.47715f, 6.47719f, 2f, 12f, 2f)
        curveTo(16.4777f, 2f, 20.2257f, 4.94289f, 21.5f, 9f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8f)
        verticalLineTo(12f)
        lineTo(14f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.9551f, 13f)
        curveTo(21.9848f, 12.6709f, 22f, 12.3373f, 22f, 12f)
        moveTo(15f, 22f)
        curveTo(15.3416f, 21.8876f, 15.6753f, 21.7564f, 16f, 21.6078f)
        moveTo(20.7906f, 17f)
        curveTo(20.9835f, 16.6284f, 21.1555f, 16.2433f, 21.305f, 15.8462f)
        moveTo(18.1925f, 20.2292f)
        curveTo(18.5369f, 19.9441f, 18.8631f, 19.6358f, 19.1688f, 19.3065f)
        }
        }.build()

        return _clock05!!
    }

private var _clock05: ImageVector? = null
