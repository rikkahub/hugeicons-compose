package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Redo03: ImageVector
    get() {
        if (_redo03 != null) {
            return _redo03!!
        }
        _redo03 = ImageVector.Builder(
            name = "Redo03",
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
        moveTo(21f, 8f)
        horizontalLineTo(9f)
        curveTo(5.68629f, 8f, 3f, 10.6863f, 3f, 14f)
        curveTo(3f, 17.3137f, 5.68629f, 20f, 9f, 20f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 4f)
        lineTo(18.1538f, 4.87652f)
        curveTo(20.0513f, 6.31801f, 21f, 7.03875f, 21f, 8f)
        curveTo(21f, 8.96125f, 20.0513f, 9.68199f, 18.1538f, 11.1235f)
        lineTo(17f, 12f)
        }
        }.build()

        return _redo03!!
    }

private var _redo03: ImageVector? = null
