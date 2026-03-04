package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RubiksCube: ImageVector
    get() {
        if (_rubiksCube != null) {
            return _rubiksCube!!
        }
        _rubiksCube = ImageVector.Builder(
            name = "RubiksCube",
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
        moveTo(8.64298f, 3.0853f)
        curveTo(10.2952f, 2.36177f, 11.1214f, 2f, 12f, 2f)
        curveTo(12.8786f, 2f, 13.7048f, 2.36177f, 15.357f, 3.0853f)
        lineTo(17.0618f, 3.83185f)
        curveTo(19.6873f, 4.98154f, 21f, 5.55639f, 21f, 6.5f)
        curveTo(21f, 7.44361f, 19.6873f, 8.01846f, 17.0618f, 9.16815f)
        lineTo(15.357f, 9.9147f)
        curveTo(13.7048f, 10.6382f, 12.8786f, 11f, 12f, 11f)
        curveTo(11.1214f, 11f, 10.2952f, 10.6382f, 8.64298f, 9.9147f)
        lineTo(6.93817f, 9.16815f)
        curveTo(4.31272f, 8.01846f, 3f, 7.44361f, 3f, 6.5f)
        curveTo(3f, 5.55639f, 4.31272f, 4.98154f, 6.93816f, 3.83185f)
        lineTo(8.64298f, 3.0853f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 6.5f)
        verticalLineTo(17.5f)
        curveTo(21f, 18.4436f, 19.6873f, 19.0185f, 17.0618f, 20.1682f)
        lineTo(15.357f, 20.9147f)
        curveTo(13.7048f, 21.6382f, 12.8786f, 22f, 12f, 22f)
        curveTo(11.1214f, 22f, 10.2952f, 21.6382f, 8.64298f, 20.9147f)
        lineTo(6.93817f, 20.1682f)
        curveTo(4.31272f, 19.0185f, 3f, 18.4436f, 3f, 17.5f)
        verticalLineTo(6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 12.5f)
        lineTo(12f, 17f)
        lineTo(3f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 20f)
        verticalLineTo(9f)
        lineTo(7f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 20f)
        verticalLineTo(9f)
        lineTo(17f, 4f)
        }
        }.build()

        return _rubiksCube!!
    }

private var _rubiksCube: ImageVector? = null
