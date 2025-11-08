package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Brain03: ImageVector
    get() {
        if (_brain03 != null) {
            return _brain03!!
        }
        _brain03 = ImageVector.Builder(
            name = "Brain03",
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
        moveTo(12f, 19f)
        verticalLineTo(5f)
        curveTo(12f, 3.34315f, 10.6569f, 2f, 9f, 2f)
        curveTo(7.34315f, 2f, 6f, 3.34315f, 6f, 5f)
        curveTo(6f, 5.55228f, 5.55228f, 6f, 5f, 6f)
        curveTo(3.34315f, 6f, 2f, 7.34315f, 2f, 9f)
        curveTo(2f, 10.6569f, 3.34315f, 12f, 5f, 12f)
        curveTo(3.34315f, 12f, 2f, 13.3431f, 2f, 15f)
        curveTo(2f, 16.6569f, 3.34315f, 18f, 5f, 18f)
        curveTo(5.55228f, 18f, 6f, 18.4477f, 6f, 19f)
        curveTo(6f, 20.6569f, 7.34315f, 22f, 9f, 22f)
        curveTo(10.6569f, 22f, 12f, 20.6569f, 12f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19f)
        verticalLineTo(5f)
        curveTo(12f, 3.34315f, 13.3431f, 2f, 15f, 2f)
        curveTo(16.6569f, 2f, 18f, 3.34315f, 18f, 5f)
        curveTo(18f, 5.55228f, 18.4477f, 6f, 19f, 6f)
        curveTo(20.6569f, 6f, 22f, 7.34315f, 22f, 9f)
        curveTo(22f, 10.6569f, 20.6569f, 12f, 19f, 12f)
        curveTo(20.6569f, 12f, 22f, 13.3431f, 22f, 15f)
        curveTo(22f, 16.6569f, 20.6569f, 18f, 19f, 18f)
        curveTo(18.4477f, 18f, 18f, 18.4477f, 18f, 19f)
        curveTo(18f, 20.6569f, 16.6569f, 22f, 15f, 22f)
        curveTo(13.3431f, 22f, 12f, 20.6569f, 12f, 19f)
        }
        }.build()

        return _brain03!!
    }

private var _brain03: ImageVector? = null
