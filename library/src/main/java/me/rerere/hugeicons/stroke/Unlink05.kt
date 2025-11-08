package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Unlink05: ImageVector
    get() {
        if (_unlink05 != null) {
            return _unlink05!!
        }
        _unlink05 = ImageVector.Builder(
            name = "Unlink05",
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
        moveTo(15.5f, 21f)
        lineTo(14f, 19.5f)
        moveTo(8.5f, 21f)
        lineTo(10f, 19.5f)
        moveTo(8.5f, 3f)
        lineTo(10f, 4.5f)
        moveTo(15.5f, 3f)
        lineTo(14f, 4.5f)
        }
        }.build()

        return _unlink05!!
    }

private var _unlink05: ImageVector? = null
