package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chip02: ImageVector
    get() {
        if (_chip02 != null) {
            return _chip02!!
        }
        _chip02 = ImageVector.Builder(
            name = "Chip02",
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
        moveTo(12f, 12f)
        curveTo(11.1716f, 12f, 10.5f, 12.5596f, 10.5f, 13.25f)
        curveTo(10.5f, 13.9404f, 11.1716f, 14.5f, 12f, 14.5f)
        curveTo(12.8284f, 14.5f, 13.5f, 13.9404f, 13.5f, 13.25f)
        curveTo(13.5f, 12.5596f, 12.8284f, 12f, 12f, 12f)
        moveTo(12f, 12f)
        curveTo(12.8284f, 12f, 13.5f, 11.4404f, 13.5f, 10.75f)
        curveTo(13.5f, 10.0596f, 12.8284f, 9.5f, 12f, 9.5f)
        curveTo(11.1716f, 9.5f, 10.5f, 10.0596f, 10.5f, 10.75f)
        curveTo(10.5f, 11.4404f, 11.1716f, 12f, 12f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        verticalLineTo(6f)
        moveTo(12f, 18f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.9992f, 12f)
        lineTo(17.9992f, 12f)
        moveTo(6f, 12.0005f)
        lineTo(2f, 12.0005f)
        }
        }.build()

        return _chip02!!
    }

private var _chip02: ImageVector? = null
