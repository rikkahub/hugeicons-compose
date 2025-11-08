package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cylinder01: ImageVector
    get() {
        if (_cylinder01 != null) {
            return _cylinder01!!
        }
        _cylinder01 = ImageVector.Builder(
            name = "Cylinder01",
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
        moveTo(20f, 5.5f)
        curveTo(20f, 7.433f, 16.4183f, 9f, 12f, 9f)
        curveTo(7.58172f, 9f, 4f, 7.433f, 4f, 5.5f)
        curveTo(4f, 3.567f, 7.58172f, 2f, 12f, 2f)
        curveTo(16.4183f, 2f, 20f, 3.567f, 20f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 18.5f)
        curveTo(20f, 20.433f, 16.4183f, 22f, 12f, 22f)
        curveTo(7.58172f, 22f, 4f, 20.433f, 4f, 18.5f)
        curveTo(4f, 16.567f, 7.58172f, 15f, 12f, 15f)
        curveTo(16.4183f, 15f, 20f, 16.567f, 20f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 18.5f)
        verticalLineTo(5.5f)
        moveTo(4f, 18.5f)
        verticalLineTo(5.5f)
        }
        }.build()

        return _cylinder01!!
    }

private var _cylinder01: ImageVector? = null
