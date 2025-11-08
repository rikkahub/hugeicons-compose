package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Rubik'sCube: ImageVector
    get() {
        if (_rubik'sCube != null) {
            return _rubik'sCube!!
        }
        _rubik'sCube = ImageVector.Builder(
            name = "Rubik'sCube",
            defaultWidth = 24.dp,
            defaultHeight = 25.dp,
            viewportWidth = 24f,
            viewportHeight = 25f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.64298f, 3.5853f)
        curveTo(10.2952f, 2.86177f, 11.1214f, 2.5f, 12f, 2.5f)
        curveTo(12.8786f, 2.5f, 13.7048f, 2.86177f, 15.357f, 3.5853f)
        lineTo(17.0618f, 4.33185f)
        curveTo(19.6873f, 5.48154f, 21f, 6.05639f, 21f, 7f)
        curveTo(21f, 7.94361f, 19.6873f, 8.51846f, 17.0618f, 9.66815f)
        lineTo(15.357f, 10.4147f)
        curveTo(13.7048f, 11.1382f, 12.8786f, 11.5f, 12f, 11.5f)
        curveTo(11.1214f, 11.5f, 10.2952f, 11.1382f, 8.64298f, 10.4147f)
        lineTo(6.93817f, 9.66815f)
        curveTo(4.31272f, 8.51846f, 3f, 7.94361f, 3f, 7f)
        curveTo(3f, 6.05639f, 4.31272f, 5.48154f, 6.93816f, 4.33185f)
        lineTo(8.64298f, 3.5853f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 7f)
        verticalLineTo(18f)
        curveTo(21f, 18.9436f, 19.6873f, 19.5185f, 17.0618f, 20.6682f)
        lineTo(15.357f, 21.4147f)
        curveTo(13.7048f, 22.1382f, 12.8786f, 22.5f, 12f, 22.5f)
        curveTo(11.1214f, 22.5f, 10.2952f, 22.1382f, 8.64298f, 21.4147f)
        lineTo(6.93817f, 20.6682f)
        curveTo(4.31272f, 19.5185f, 3f, 18.9436f, 3f, 18f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 13f)
        lineTo(12f, 17.5f)
        lineTo(3f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22.5f)
        verticalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 20.5f)
        verticalLineTo(9.5f)
        lineTo(7f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 20.5f)
        verticalLineTo(9.5f)
        lineTo(17f, 4.5f)
        }
        }.build()

        return _rubik'sCube!!
    }

private var _rubik'sCube: ImageVector? = null
