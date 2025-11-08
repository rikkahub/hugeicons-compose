package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InsertRowUp: ImageVector
    get() {
        if (_insertRowUp != null) {
            return _insertRowUp!!
        }
        _insertRowUp = ImageVector.Builder(
            name = "InsertRowUp",
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
        moveTo(18f, 2.8125f)
        curveTo(18.8888f, 3.01415f, 19.5638f, 3.34564f, 20.1088f, 3.89059f)
        curveTo(21.5f, 5.28184f, 21.5f, 7.52101f, 21.5f, 11.9994f)
        curveTo(21.5f, 16.4777f, 21.5f, 18.7169f, 20.1088f, 20.1081f)
        curveTo(18.7175f, 21.4993f, 16.4783f, 21.4993f, 12f, 21.4993f)
        curveTo(7.52166f, 21.4993f, 5.28249f, 21.4993f, 3.89124f, 20.1081f)
        curveTo(2.5f, 18.7169f, 2.5f, 16.4777f, 2.5f, 11.9993f)
        curveTo(2.5f, 7.52101f, 2.5f, 5.28184f, 3.89124f, 3.89059f)
        curveTo(4.4362f, 3.34564f, 5.11125f, 3.01415f, 6.00001f, 2.8125f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 5.5f)
        lineTo(12f, 2.5f)
        lineTo(15f, 5.5f)
        moveTo(12f, 3.5f)
        verticalLineTo(10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 15f)
        horizontalLineTo(21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 21.5f)
        lineTo(8.5f, 15f)
        moveTo(15.5f, 21.5f)
        lineTo(15.5f, 15f)
        }
        }.build()

        return _insertRowUp!!
    }

private var _insertRowUp: ImageVector? = null
