package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Link05: ImageVector
    get() {
        if (_link05 != null) {
            return _link05!!
        }
        _link05 = ImageVector.Builder(
            name = "Link05",
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
        moveTo(13.5f, 17f)
        horizontalLineTo(17f)
        curveTo(19.7614f, 17f, 22f, 14.7614f, 22f, 12f)
        curveTo(22f, 9.23858f, 19.7614f, 7f, 17f, 7f)
        horizontalLineTo(13.5f)
        moveTo(10.5f, 17f)
        horizontalLineTo(7f)
        curveTo(4.23858f, 17f, 2f, 14.7614f, 2f, 12f)
        curveTo(2f, 9.23858f, 4.23858f, 7f, 7f, 7f)
        horizontalLineTo(10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 12f)
        horizontalLineTo(15f)
        }
        }.build()

        return _link05!!
    }

private var _link05: ImageVector? = null
