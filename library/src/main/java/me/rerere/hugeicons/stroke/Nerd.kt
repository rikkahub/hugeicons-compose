package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Nerd: ImageVector
    get() {
        if (_nerd != null) {
            return _nerd!!
        }
        _nerd = ImageVector.Builder(
            name = "Nerd",
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
        moveTo(8f, 15f)
        curveTo(8.91212f, 16.2144f, 10.3643f, 17f, 12f, 17f)
        curveTo(13.6357f, 17f, 15.0879f, 16.2144f, 16f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 9f)
        curveTo(10f, 10.1046f, 9.10457f, 11f, 8f, 11f)
        curveTo(6.89543f, 11f, 6f, 10.1046f, 6f, 9f)
        curveTo(6f, 7.89543f, 6.89543f, 7f, 8f, 7f)
        curveTo(9.10457f, 7f, 10f, 7.89543f, 10f, 9f)
        moveTo(10f, 9f)
        curveTo(10.5602f, 8.43978f, 11.1643f, 8f, 12f, 8f)
        curveTo(12.8357f, 8f, 13.4398f, 8.43978f, 14f, 9f)
        moveTo(21f, 8f)
        horizontalLineTo(17.7324f)
        moveTo(6.26756f, 8f)
        horizontalLineTo(3f)
        moveTo(14f, 9f)
        curveTo(14f, 10.1046f, 14.8954f, 11f, 16f, 11f)
        curveTo(17.1046f, 11f, 18f, 10.1046f, 18f, 9f)
        curveTo(18f, 7.89543f, 17.1046f, 7f, 16f, 7f)
        curveTo(14.8954f, 7f, 14f, 7.89543f, 14f, 9f)
        }
        }.build()

        return _nerd!!
    }

private var _nerd: ImageVector? = null
