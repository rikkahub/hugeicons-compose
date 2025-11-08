package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RemoveCircle: ImageVector
    get() {
        if (_removeCircle != null) {
            return _removeCircle!!
        }
        _removeCircle = ImageVector.Builder(
            name = "RemoveCircle",
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
        moveTo(22f, 12.0001f)
        curveTo(22f, 6.47721f, 17.5228f, 2.00006f, 12f, 2.00006f)
        curveTo(6.47715f, 2.00006f, 2f, 6.47721f, 2f, 12.0001f)
        curveTo(2f, 17.5229f, 6.47715f, 22.0001f, 12f, 22.0001f)
        curveTo(17.5228f, 22.0001f, 22f, 17.5229f, 22f, 12.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 12.0001f)
        lineTo(8f, 12.0001f)
        }
        }.build()

        return _removeCircle!!
    }

private var _removeCircle: ImageVector? = null
