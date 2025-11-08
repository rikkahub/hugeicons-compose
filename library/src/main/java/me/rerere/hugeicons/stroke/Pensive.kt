package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pensive: ImageVector
    get() {
        if (_pensive != null) {
            return _pensive!!
        }
        _pensive = ImageVector.Builder(
            name = "Pensive",
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
        moveTo(9f, 16f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 9f)
        curveTo(7.20949f, 9.5826f, 7.77476f, 10f, 8.43922f, 10f)
        curveTo(9.10367f, 10f, 9.66894f, 9.5826f, 9.87843f, 9f)
        moveTo(14.1216f, 9f)
        curveTo(14.3311f, 9.5826f, 14.8963f, 10f, 15.5608f, 10f)
        curveTo(16.2252f, 10f, 16.7905f, 9.5826f, 17f, 9f)
        }
        }.build()

        return _pensive!!
    }

private var _pensive: ImageVector? = null
