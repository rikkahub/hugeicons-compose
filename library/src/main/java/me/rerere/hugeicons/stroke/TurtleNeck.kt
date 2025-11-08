package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TurtleNeck: ImageVector
    get() {
        if (_turtleNeck != null) {
            return _turtleNeck!!
        }
        _turtleNeck = ImageVector.Builder(
            name = "TurtleNeck",
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
        moveTo(6.9618f, 13.0591f)
        lineTo(4.56841f, 20.2197f)
        curveTo(4.42904f, 20.6366f, 4.35936f, 20.8451f, 4.18712f, 20.9399f)
        curveTo(3.82412f, 21.1398f, 2.32946f, 20.8084f, 2.07132f, 20.4251f)
        curveTo(1.9625f, 20.2635f, 1.99464f, 20.0483f, 2.05892f, 19.6178f)
        lineTo(3.61592f, 9.19215f)
        curveTo(3.88106f, 7.41681f, 4.29884f, 6.86652f, 5.93466f, 6.12499f)
        lineTo(9f, 4.51741f)
        verticalLineTo(3.01007f)
        curveTo(9f, 2.17768f, 9.17499f, 2.00517f, 10.0076f, 2.00517f)
        lineTo(13.9924f, 2f)
        curveTo(14.825f, 2f, 15f, 2.17251f, 15f, 3.0049f)
        verticalLineTo(4.51224f)
        lineTo(18.0653f, 6.12499f)
        curveTo(19.7012f, 6.86652f, 20.1189f, 7.41682f, 20.3841f, 9.19215f)
        lineTo(21.9411f, 19.6178f)
        curveTo(22.0054f, 20.0483f, 22.0375f, 20.2635f, 21.9287f, 20.4251f)
        curveTo(21.6705f, 20.8084f, 20.1759f, 21.1398f, 19.8129f, 20.9399f)
        curveTo(19.6406f, 20.8451f, 19.571f, 20.6366f, 19.4316f, 20.2197f)
        lineTo(17.0382f, 13.0591f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 10f)
        curveTo(6.66613f, 10.9968f, 6.87572f, 11.9958f, 6.95911f, 13.0034f)
        curveTo(7.15045f, 15.3153f, 7f, 17.683f, 7f, 20f)
        curveTo(7f, 21.6547f, 7.34533f, 22f, 9f, 22f)
        horizontalLineTo(15f)
        curveTo(16.6547f, 22f, 17f, 21.6547f, 17f, 20f)
        curveTo(17f, 17.683f, 16.8495f, 15.3153f, 17.0409f, 13.0034f)
        curveTo(17.1243f, 11.9958f, 17.3339f, 10.9968f, 17.5f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 5f)
        curveTo(10.8f, 6.33333f, 13.2f, 6.33333f, 15f, 5f)
        }
        }.build()

        return _turtleNeck!!
    }

private var _turtleNeck: ImageVector? = null
