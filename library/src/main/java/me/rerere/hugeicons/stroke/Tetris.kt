package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tetris: ImageVector
    get() {
        if (_tetris != null) {
            return _tetris!!
        }
        _tetris = ImageVector.Builder(
            name = "Tetris",
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
        moveTo(7f, 5f)
        curveTo(7f, 4.05719f, 7f, 3.58579f, 7.29289f, 3.29289f)
        curveTo(7.58579f, 3f, 8.05719f, 3f, 9f, 3f)
        curveTo(9.94281f, 3f, 10.4142f, 3f, 10.7071f, 3.29289f)
        curveTo(11f, 3.58579f, 11f, 4.05719f, 11f, 5f)
        verticalLineTo(9f)
        curveTo(11f, 9.94281f, 11f, 10.4142f, 10.7071f, 10.7071f)
        curveTo(10.4142f, 11f, 9.94281f, 11f, 9f, 11f)
        curveTo(8.05719f, 11f, 7.58579f, 11f, 7.29289f, 10.7071f)
        curveTo(7f, 10.4142f, 7f, 9.94281f, 7f, 9f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 15f)
        curveTo(13f, 14.0572f, 13f, 13.5858f, 13.2929f, 13.2929f)
        curveTo(13.5858f, 13f, 14.0572f, 13f, 15f, 13f)
        curveTo(15.9428f, 13f, 16.4142f, 13f, 16.7071f, 13.2929f)
        curveTo(17f, 13.5858f, 17f, 14.0572f, 17f, 15f)
        curveTo(17f, 15.9428f, 17f, 16.4142f, 16.7071f, 16.7071f)
        curveTo(16.4142f, 17f, 15.9428f, 17f, 15f, 17f)
        curveTo(14.0572f, 17f, 13.5858f, 17f, 13.2929f, 16.7071f)
        curveTo(13f, 16.4142f, 13f, 15.9428f, 13f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 19f)
        curveTo(9f, 18.0572f, 9f, 17.5858f, 9.29289f, 17.2929f)
        curveTo(9.58579f, 17f, 10.0572f, 17f, 11f, 17f)
        horizontalLineTo(19f)
        curveTo(19.9428f, 17f, 20.4142f, 17f, 20.7071f, 17.2929f)
        curveTo(21f, 17.5858f, 21f, 18.0572f, 21f, 19f)
        curveTo(21f, 19.9428f, 21f, 20.4142f, 20.7071f, 20.7071f)
        curveTo(20.4142f, 21f, 19.9428f, 21f, 19f, 21f)
        horizontalLineTo(11f)
        curveTo(10.0572f, 21f, 9.58579f, 21f, 9.29289f, 20.7071f)
        curveTo(9f, 20.4142f, 9f, 19.9428f, 9f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 9f)
        curveTo(3f, 8.05719f, 3f, 7.58579f, 3.29289f, 7.29289f)
        curveTo(3.58579f, 7f, 4.05719f, 7f, 5f, 7f)
        curveTo(5.94281f, 7f, 6.41421f, 7f, 6.70711f, 7.29289f)
        curveTo(7f, 7.58579f, 7f, 8.05719f, 7f, 9f)
        verticalLineTo(13f)
        curveTo(7f, 13.9428f, 7f, 14.4142f, 6.70711f, 14.7071f)
        curveTo(6.41421f, 15f, 5.94281f, 15f, 5f, 15f)
        curveTo(4.05719f, 15f, 3.58579f, 15f, 3.29289f, 14.7071f)
        curveTo(3f, 14.4142f, 3f, 13.9428f, 3f, 13f)
        verticalLineTo(9f)
        }
        }.build()

        return _tetris!!
    }

private var _tetris: ImageVector? = null
