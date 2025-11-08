package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowDown02: ImageVector
    get() {
        if (_arrowDown02 != null) {
            return _arrowDown02!!
        }
        _arrowDown02 = ImageVector.Builder(
            name = "ArrowDown02",
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
        moveTo(12f, 18.502f)
        verticalLineTo(5.00195f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 13.002f)
        curveTo(18f, 13.002f, 13.5811f, 19.0019f, 12f, 19.002f)
        curveTo(10.4188f, 19.002f, 6f, 13.002f, 6f, 13.002f)
        }
        }.build()

        return _arrowDown02!!
    }

private var _arrowDown02: ImageVector? = null
