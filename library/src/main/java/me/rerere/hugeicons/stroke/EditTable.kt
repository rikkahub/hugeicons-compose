package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EditTable: ImageVector
    get() {
        if (_editTable != null) {
            return _editTable!!
        }
        _editTable = ImageVector.Builder(
            name = "EditTable",
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
        moveTo(12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 9f)
        lineTo(21.5f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 13f)
        lineTo(16.5f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 17f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 21.5f)
        lineTo(12f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.6014f, 19.6832f)
        lineTo(20.8308f, 17.4538f)
        curveTo(21.1423f, 17.1424f, 21.298f, 16.9867f, 21.3812f, 16.8187f)
        curveTo(21.5396f, 16.4991f, 21.5396f, 16.1239f, 21.3812f, 15.8043f)
        curveTo(21.298f, 15.6363f, 21.1423f, 15.4806f, 20.8308f, 15.1692f)
        curveTo(20.5194f, 14.8577f, 20.3637f, 14.702f, 20.1957f, 14.6188f)
        curveTo(19.8761f, 14.4604f, 19.5009f, 14.4604f, 19.1813f, 14.6188f)
        curveTo(19.0133f, 14.702f, 18.8576f, 14.8577f, 18.5462f, 15.1692f)
        lineTo(16.1155f, 17.5999f)
        curveTo(15.4028f, 18.3126f, 15.0464f, 18.6689f, 14.8262f, 19.1056f)
        curveTo(14.7582f, 19.2404f, 14.7003f, 19.3802f, 14.6531f, 19.5237f)
        curveTo(14.5f, 19.9881f, 14.5f, 20.4921f, 14.5f, 21.5f)
        lineTo(15.155f, 21.4064f)
        curveTo(16.1514f, 21.2641f, 16.6496f, 21.1929f, 17.0917f, 20.9718f)
        curveTo(17.5339f, 20.7508f, 17.8897f, 20.3949f, 18.6014f, 19.6832f)
        }
        }.build()

        return _editTable!!
    }

private var _editTable: ImageVector? = null
