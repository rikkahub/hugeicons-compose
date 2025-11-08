package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Share06: ImageVector
    get() {
        if (_share06 != null) {
            return _share06!!
        }
        _share06 = ImageVector.Builder(
            name = "Share06",
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
        moveTo(19f, 13f)
        curveTo(19f, 17.4183f, 15.4183f, 21f, 11f, 21f)
        curveTo(6.58172f, 21f, 3f, 17.4183f, 3f, 13f)
        curveTo(3f, 8.58172f, 6.58172f, 5f, 11f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 3f)
        horizontalLineTo(18f)
        curveTo(19.4142f, 3f, 20.1213f, 3f, 20.5607f, 3.43934f)
        curveTo(21f, 3.87868f, 21f, 4.58579f, 21f, 6f)
        verticalLineTo(10f)
        moveTo(20f, 4f)
        lineTo(11f, 13f)
        }
        }.build()

        return _share06!!
    }

private var _share06: ImageVector? = null
