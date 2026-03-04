package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FilterMailEdit: ImageVector
    get() {
        if (_filterMailEdit != null) {
            return _filterMailEdit!!
        }
        _filterMailEdit = ImageVector.Builder(
            name = "FilterMailEdit",
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
        moveTo(3f, 6f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 18f)
        horizontalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.0071f, 17.5986f)
        lineTo(14f, 18f)
        lineTo(14.4014f, 15.9929f)
        curveTo(14.4367f, 15.8165f, 14.5234f, 15.6545f, 14.6506f, 15.5273f)
        lineTo(18.9111f, 11.2668f)
        curveTo(19.2668f, 10.9111f, 19.8437f, 10.9111f, 20.1995f, 11.2668f)
        lineTo(20.7332f, 11.8005f)
        curveTo(21.0889f, 12.1563f, 21.0889f, 12.7332f, 20.7332f, 13.0889f)
        lineTo(16.4727f, 17.3494f)
        curveTo(16.3455f, 17.4766f, 16.1835f, 17.5633f, 16.0071f, 17.5986f)
        }
        }.build()

        return _filterMailEdit!!
    }

private var _filterMailEdit: ImageVector? = null
