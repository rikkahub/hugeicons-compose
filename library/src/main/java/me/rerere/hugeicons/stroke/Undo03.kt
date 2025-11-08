package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Undo03: ImageVector
    get() {
        if (_undo03 != null) {
            return _undo03!!
        }
        _undo03 = ImageVector.Builder(
            name = "Undo03",
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
        moveTo(3f, 8f)
        horizontalLineTo(15f)
        curveTo(18.3137f, 8f, 21f, 10.6863f, 21f, 14f)
        curveTo(21f, 17.3137f, 18.3137f, 20f, 15f, 20f)
        horizontalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 4f)
        lineTo(5.8462f, 4.87652f)
        curveTo(3.94873f, 6.31801f, 3f, 7.03875f, 3f, 8f)
        curveTo(3f, 8.96125f, 3.94873f, 9.68199f, 5.8462f, 11.1235f)
        lineTo(7f, 12f)
        }
        }.build()

        return _undo03!!
    }

private var _undo03: ImageVector? = null
