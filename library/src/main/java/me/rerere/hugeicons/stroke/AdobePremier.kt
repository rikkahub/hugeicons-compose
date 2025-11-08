package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AdobePremier: ImageVector
    get() {
        if (_adobePremier != null) {
            return _adobePremier!!
        }
        _adobePremier = ImageVector.Builder(
            name = "AdobePremier",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 16f)
        verticalLineTo(12f)
        moveTo(7f, 12f)
        verticalLineTo(8.57143f)
        curveTo(7f, 8.21809f, 7.23449f, 8f, 7.57143f, 8f)
        horizontalLineTo(9f)
        curveTo(10.1046f, 8f, 11f, 8.89543f, 11f, 10f)
        curveTo(11f, 11.1046f, 10.1046f, 12f, 9f, 12f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 10.5f)
        verticalLineTo(12.5f)
        moveTo(14f, 12.5f)
        verticalLineTo(16f)
        moveTo(14f, 12.5f)
        curveTo(14.561f, 11.752f, 15.0832f, 10.8199f, 16f, 10.5663f)
        curveTo(16.1547f, 10.5235f, 16.3207f, 10.5f, 16.5f, 10.5f)
        }
        }.build()

        return _adobePremier!!
    }

private var _adobePremier: ImageVector? = null
