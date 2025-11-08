package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowLeft02: ImageVector
    get() {
        if (_arrowLeft02 != null) {
            return _arrowLeft02!!
        }
        _arrowLeft02 = ImageVector.Builder(
            name = "ArrowLeft02",
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
        moveTo(5.5f, 12.002f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.9999f, 18.002f)
        curveTo(10.9999f, 18.002f, 4.99998f, 13.583f, 4.99997f, 12.0019f)
        curveTo(4.99996f, 10.4208f, 11f, 6.00195f, 11f, 6.00195f)
        }
        }.build()

        return _arrowLeft02!!
    }

private var _arrowLeft02: ImageVector? = null
