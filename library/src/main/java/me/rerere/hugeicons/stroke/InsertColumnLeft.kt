package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InsertColumnLeft: ImageVector
    get() {
        if (_insertColumnLeft != null) {
            return _insertColumnLeft!!
        }
        _insertColumnLeft = ImageVector.Builder(
            name = "InsertColumnLeft",
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
        moveTo(2.8125f, 18f)
        curveTo(3.01415f, 18.8888f, 3.34564f, 19.5638f, 3.89059f, 20.1088f)
        curveTo(5.28184f, 21.5f, 7.52101f, 21.5f, 11.9994f, 21.5f)
        curveTo(16.4777f, 21.5f, 18.7169f, 21.5f, 20.1081f, 20.1088f)
        curveTo(21.4993f, 18.7175f, 21.4993f, 16.4783f, 21.4993f, 12f)
        curveTo(21.4993f, 7.52166f, 21.4993f, 5.28249f, 20.1081f, 3.89124f)
        curveTo(18.7169f, 2.5f, 16.4777f, 2.5f, 11.9994f, 2.5f)
        curveTo(7.52101f, 2.5f, 5.28184f, 2.5f, 3.89059f, 3.89124f)
        curveTo(3.34564f, 4.4362f, 3.01415f, 5.11125f, 2.8125f, 6.00001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 9f)
        lineTo(2.5f, 12f)
        lineTo(5.5f, 15f)
        moveTo(3.5f, 12f)
        lineTo(10.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 2.49805f)
        lineTo(15f, 21.498f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 8.49805f)
        horizontalLineTo(15f)
        moveTo(21.5f, 15.498f)
        horizontalLineTo(15f)
        }
        }.build()

        return _insertColumnLeft!!
    }

private var _insertColumnLeft: ImageVector? = null
