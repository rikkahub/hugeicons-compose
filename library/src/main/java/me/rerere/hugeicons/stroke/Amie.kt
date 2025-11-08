package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Amie: ImageVector
    get() {
        if (_amie != null) {
            return _amie!!
        }
        _amie = ImageVector.Builder(
            name = "Amie",
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
        moveTo(3f, 8.5f)
        curveTo(3f, 9.82963f, 3.47182f, 11.0491f, 4.25716f, 12f)
        curveTo(3.47182f, 12.9509f, 3f, 14.1704f, 3f, 15.5f)
        curveTo(3f, 18.5376f, 5.46243f, 21f, 8.5f, 21f)
        curveTo(9.82963f, 21f, 11.0491f, 20.5282f, 12f, 19.7428f)
        curveTo(12.9509f, 20.5282f, 14.1704f, 21f, 15.5f, 21f)
        curveTo(18.5376f, 21f, 21f, 18.5376f, 21f, 15.5f)
        curveTo(21f, 14.1704f, 20.5282f, 12.9509f, 19.7428f, 12f)
        curveTo(20.5282f, 11.0491f, 21f, 9.82963f, 21f, 8.5f)
        curveTo(21f, 5.46243f, 18.5376f, 3f, 15.5f, 3f)
        curveTo(14.1704f, 3f, 12.9509f, 3.47182f, 12f, 4.25716f)
        curveTo(11.0491f, 3.47182f, 9.82963f, 3f, 8.5f, 3f)
        curveTo(5.46243f, 3f, 3f, 5.46243f, 3f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 9.5f)
        curveTo(10.5f, 8.67157f, 11.1716f, 8f, 12f, 8f)
        curveTo(12.8284f, 8f, 13.5f, 8.67157f, 13.5f, 9.5f)
        verticalLineTo(14.5f)
        curveTo(13.5f, 15.3284f, 12.8284f, 16f, 12f, 16f)
        curveTo(11.1716f, 16f, 10.5f, 15.3284f, 10.5f, 14.5f)
        verticalLineTo(9.5f)
        }
        }.build()

        return _amie!!
    }

private var _amie: ImageVector? = null
