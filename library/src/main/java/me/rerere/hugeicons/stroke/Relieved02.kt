package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Relieved02: ImageVector
    get() {
        if (_relieved02 != null) {
            return _relieved02!!
        }
        _relieved02 = ImageVector.Builder(
            name = "Relieved02",
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
        moveTo(7f, 9f)
        curveTo(7.20949f, 9.5826f, 7.77476f, 10f, 8.43922f, 10f)
        curveTo(9.10367f, 10f, 9.66894f, 9.5826f, 9.87843f, 9f)
        moveTo(14.1216f, 9f)
        curveTo(14.3311f, 9.5826f, 14.8963f, 10f, 15.5608f, 10f)
        curveTo(16.2252f, 10f, 16.7905f, 9.5826f, 17f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17.5f)
        curveTo(10f, 17.5f, 8f, 16f, 7.5f, 14f)
        }
        }.build()

        return _relieved02!!
    }

private var _relieved02: ImageVector? = null
