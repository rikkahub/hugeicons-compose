package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sun03: ImageVector
    get() {
        if (_sun03 != null) {
            return _sun03!!
        }
        _sun03 = ImageVector.Builder(
            name = "Sun03",
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
        moveTo(17f, 12f)
        curveTo(17f, 14.7614f, 14.7614f, 17f, 12f, 17f)
        curveTo(9.23858f, 17f, 7f, 14.7614f, 7f, 12f)
        curveTo(7f, 9.23858f, 9.23858f, 7f, 12f, 7f)
        curveTo(14.7614f, 7f, 17f, 9.23858f, 17f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        verticalLineTo(3.5f)
        moveTo(12f, 20.5f)
        verticalLineTo(22f)
        moveTo(19.0708f, 19.0713f)
        lineTo(18.0101f, 18.0106f)
        moveTo(5.98926f, 5.98926f)
        lineTo(4.9286f, 4.9286f)
        moveTo(22f, 12f)
        horizontalLineTo(20.5f)
        moveTo(3.5f, 12f)
        horizontalLineTo(2f)
        moveTo(19.0713f, 4.92871f)
        lineTo(18.0106f, 5.98937f)
        moveTo(5.98975f, 18.0107f)
        lineTo(4.92909f, 19.0714f)
        }
        }.build()

        return _sun03!!
    }

private var _sun03: ImageVector? = null
