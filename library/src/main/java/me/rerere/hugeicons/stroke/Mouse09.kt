package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mouse09: ImageVector
    get() {
        if (_mouse09 != null) {
            return _mouse09!!
        }
        _mouse09 = ImageVector.Builder(
            name = "Mouse09",
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
        moveTo(12f, 22f)
        curveTo(18f, 22f, 19.5f, 17.49f, 19.5f, 12f)
        curveTo(19.5f, 6.50998f, 18f, 2f, 12f, 2f)
        curveTo(5.99993f, 2f, 4.5f, 6.50996f, 4.5f, 12f)
        curveTo(4.5f, 17.49f, 5.99993f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        verticalLineTo(6f)
        }
        }.build()

        return _mouse09!!
    }

private var _mouse09: ImageVector? = null
