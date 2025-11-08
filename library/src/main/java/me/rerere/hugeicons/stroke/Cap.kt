package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cap: ImageVector
    get() {
        if (_cap != null) {
            return _cap!!
        }
        _cap = ImageVector.Builder(
            name = "Cap",
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
        moveTo(2.5f, 16.9999f)
        lineTo(2.05801f, 14.5261f)
        curveTo(1.4248f, 8.63642f, 6.05622f, 3.49994f, 12f, 3.49994f)
        curveTo(17.9438f, 3.49994f, 22.5752f, 8.63642f, 21.942f, 14.5261f)
        lineTo(21.5f, 16.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.0157f, 10.4999f)
        curveTo(7.81291f, 7.295f, 9.59813f, 3.49994f, 12f, 3.49994f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 10.4999f)
        curveTo(16.2028f, 7.295f, 14.4176f, 3.49994f, 12.0157f, 3.49994f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2.99994f)
        verticalLineTo(1.99994f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 17.0093f)
        curveTo(10.5f, 14.1427f, 13.5f, 14.5243f, 21.5f, 17.0093f)
        curveTo(21.2236f, 18.1308f, 21.0732f, 21.2995f, 19.851f, 21.8966f)
        curveTo(19.265f, 22.1829f, 18.4247f, 21.7988f, 17.821f, 21.6546f)
        curveTo(14.9252f, 20.9629f, 13.4773f, 20.617f, 12f, 20.617f)
        curveTo(10.5227f, 20.617f, 9.07482f, 20.9629f, 6.17904f, 21.6546f)
        curveTo(5.57535f, 21.7988f, 4.73502f, 22.1829f, 4.14904f, 21.8966f)
        curveTo(2.92684f, 21.2995f, 2.77642f, 18.1308f, 2.5f, 17.0093f)
        }
        }.build()

        return _cap!!
    }

private var _cap: ImageVector? = null
