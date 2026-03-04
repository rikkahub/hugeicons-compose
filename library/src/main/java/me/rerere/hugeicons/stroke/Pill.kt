package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = ImageVector.Builder(
            name = "Pill",
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
        moveTo(11.4497f, 19.5503f)
        lineTo(19.5503f, 11.4497f)
        curveTo(20.4785f, 10.5215f, 21f, 9.2625f, 21f, 7.94975f)
        curveTo(21f, 5.21608f, 18.7839f, 3f, 16.0503f, 3f)
        curveTo(14.7375f, 3f, 13.4785f, 3.52149f, 12.5503f, 4.44975f)
        lineTo(4.44975f, 12.5503f)
        curveTo(3.52149f, 13.4785f, 3f, 14.7375f, 3f, 16.0503f)
        curveTo(3f, 18.7839f, 5.21608f, 21f, 7.94975f, 21f)
        curveTo(9.2625f, 21f, 10.5215f, 20.4785f, 11.4497f, 19.5503f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 8.5f)
        lineTo(15.5f, 15.5f)
        }
        }.build()

        return _pill!!
    }

private var _pill: ImageVector? = null
