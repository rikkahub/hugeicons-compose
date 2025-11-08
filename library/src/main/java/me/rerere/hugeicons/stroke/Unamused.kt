package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Unamused: ImageVector
    get() {
        if (_unamused != null) {
            return _unamused!!
        }
        _unamused = ImageVector.Builder(
            name = "Unamused",
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
        moveTo(7f, 8f)
        curveTo(7.20949f, 8.5826f, 7.77476f, 9f, 8.43922f, 9f)
        curveTo(9.10367f, 9f, 9.66894f, 8.5826f, 9.87843f, 8f)
        moveTo(14.1216f, 8f)
        curveTo(14.3311f, 8.5826f, 14.8963f, 9f, 15.5608f, 9f)
        curveTo(16.2252f, 9f, 16.7905f, 8.5826f, 17f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 16f)
        lineTo(15f, 14f)
        }
        }.build()

        return _unamused!!
    }

private var _unamused: ImageVector? = null
