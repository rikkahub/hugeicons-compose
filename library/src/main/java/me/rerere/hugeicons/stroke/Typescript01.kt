package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Typescript01: ImageVector
    get() {
        if (_typescript01 != null) {
            return _typescript01!!
        }
        _typescript01 = ImageVector.Builder(
            name = "Typescript01",
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
        moveTo(2.5f, 12.0001f)
        curveTo(2.5f, 7.52178f, 2.5f, 5.28261f, 3.89124f, 3.89136f)
        curveTo(5.28249f, 2.50012f, 7.52166f, 2.50012f, 12f, 2.50012f)
        curveTo(16.4783f, 2.50012f, 18.7175f, 2.50012f, 20.1088f, 3.89136f)
        curveTo(21.5f, 5.28261f, 21.5f, 7.52178f, 21.5f, 12.0001f)
        curveTo(21.5f, 16.4785f, 21.5f, 18.7176f, 20.1088f, 20.1089f)
        curveTo(18.7175f, 21.5001f, 16.4783f, 21.5001f, 12f, 21.5001f)
        curveTo(7.52166f, 21.5001f, 5.28249f, 21.5001f, 3.89124f, 20.1089f)
        curveTo(2.5f, 18.7176f, 2.5f, 16.4785f, 2.5f, 12.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 12.0001f)
        horizontalLineTo(16.2f)
        curveTo(15.5373f, 12.0001f, 15f, 12.5374f, 15f, 13.2001f)
        verticalLineTo(13.8001f)
        curveTo(15f, 14.4629f, 15.5373f, 15.0001f, 16.2f, 15.0001f)
        horizontalLineTo(16.8f)
        curveTo(17.4627f, 15.0001f, 18f, 15.5374f, 18f, 16.2001f)
        verticalLineTo(16.8001f)
        curveTo(18f, 17.4629f, 17.4627f, 18.0001f, 16.8f, 18.0001f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 12.0001f)
        horizontalLineTo(10.5f)
        moveTo(12.5f, 12.0001f)
        horizontalLineTo(10.5f)
        moveTo(10.5f, 12.0001f)
        verticalLineTo(18.0001f)
        }
        }.build()

        return _typescript01!!
    }

private var _typescript01: ImageVector? = null
