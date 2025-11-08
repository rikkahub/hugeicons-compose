package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MaleSymbol: ImageVector
    get() {
        if (_maleSymbol != null) {
            return _maleSymbol!!
        }
        _maleSymbol = ImageVector.Builder(
            name = "MaleSymbol",
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
        moveTo(21f, 9f)
        curveTo(21f, 12.3137f, 18.3137f, 15f, 15f, 15f)
        curveTo(11.6863f, 15f, 9f, 12.3137f, 9f, 9f)
        curveTo(9f, 5.68629f, 11.6863f, 3f, 15f, 3f)
        curveTo(18.3137f, 3f, 21f, 5.68629f, 21f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 15f)
        verticalLineTo(17f)
        curveTo(3f, 18.8856f, 3f, 19.8284f, 3.58579f, 20.4142f)
        curveTo(4.17157f, 21f, 5.11438f, 21f, 7f, 21f)
        horizontalLineTo(9f)
        moveTo(4f, 20f)
        lineTo(10.5f, 13.5f)
        }
        }.build()

        return _maleSymbol!!
    }

private var _maleSymbol: ImageVector? = null
