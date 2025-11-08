package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Location07: ImageVector
    get() {
        if (_location07 != null) {
            return _location07!!
        }
        _location07 = ImageVector.Builder(
            name = "Location07",
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
        moveTo(12f, 2f)
        curveTo(16.8706f, 2f, 21f, 6.03298f, 21f, 10.9258f)
        curveTo(21f, 15.8965f, 16.8033f, 19.3847f, 12.927f, 21.7567f)
        curveTo(12.6445f, 21.9162f, 12.325f, 22f, 12f, 22f)
        curveTo(11.675f, 22f, 11.3555f, 21.9162f, 11.073f, 21.7567f)
        curveTo(7.2039f, 19.3616f, 3f, 15.9137f, 3f, 10.9258f)
        curveTo(3f, 6.03298f, 7.12944f, 2f, 12f, 2f)
        }
        }.build()

        return _location07!!
    }

private var _location07: ImageVector? = null
