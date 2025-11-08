package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.At: ImageVector
    get() {
        if (_at != null) {
            return _at!!
        }
        _at = ImageVector.Builder(
            name = "At",
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
        moveTo(15.6f, 8.40033f)
        verticalLineTo(12.9003f)
        curveTo(15.6f, 14.3915f, 16.8088f, 15.6003f, 18.3f, 15.6003f)
        curveTo(19.7912f, 15.6003f, 21f, 14.3915f, 21f, 12.9003f)
        verticalLineTo(12f)
        curveTo(21f, 7.02944f, 16.9706f, 3f, 12f, 3f)
        curveTo(7.02944f, 3f, 3f, 7.02944f, 3f, 12f)
        curveTo(3f, 16.9706f, 7.02944f, 21f, 12f, 21f)
        curveTo(14.0265f, 21f, 15.8965f, 20.3302f, 17.4009f, 19.2f)
        moveTo(15.6f, 12.0003f)
        curveTo(15.6f, 13.9886f, 13.9882f, 15.6003f, 12f, 15.6003f)
        curveTo(10.0118f, 15.6003f, 8.4f, 13.9886f, 8.4f, 12.0003f)
        curveTo(8.4f, 10.0121f, 10.0118f, 8.40033f, 12f, 8.40033f)
        curveTo(13.9882f, 8.40033f, 15.6f, 10.0121f, 15.6f, 12.0003f)
        }
        }.build()

        return _at!!
    }

private var _at: ImageVector? = null
