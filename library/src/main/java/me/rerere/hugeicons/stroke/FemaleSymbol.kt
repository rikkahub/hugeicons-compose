package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FemaleSymbol: ImageVector
    get() {
        if (_femaleSymbol != null) {
            return _femaleSymbol!!
        }
        _femaleSymbol = ImageVector.Builder(
            name = "FemaleSymbol",
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
        moveTo(12f, 14f)
        curveTo(15.3137f, 14f, 18f, 11.3137f, 18f, 8f)
        curveTo(18f, 4.68629f, 15.3137f, 2f, 12f, 2f)
        curveTo(8.68629f, 2f, 6f, 4.68629f, 6f, 8f)
        curveTo(6f, 11.3137f, 8.68629f, 14f, 12f, 14f)
        moveTo(12f, 14f)
        verticalLineTo(22f)
        moveTo(9f, 19f)
        horizontalLineTo(15f)
        }
        }.build()

        return _femaleSymbol!!
    }

private var _femaleSymbol: ImageVector? = null
