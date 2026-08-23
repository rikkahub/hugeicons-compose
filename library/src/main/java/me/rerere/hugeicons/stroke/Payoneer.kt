package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Payoneer: ImageVector
    get() {
        if (_payoneer != null) {
            return _payoneer!!
        }
        _payoneer = ImageVector.Builder(
            name = "Payoneer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21.4999f, 12f)
            arcTo(9.5f, 9.5f, 0f, true, false, 2.4999000000000002f, 12f)
            arcTo(9.5f, 9.5f, 0f, true, false, 21.4999f, 12f)
            close()
        }
        }.build()

        return _payoneer!!
    }

private var _payoneer: ImageVector? = null
