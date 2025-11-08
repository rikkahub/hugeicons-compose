package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SwipeDown02: ImageVector
    get() {
        if (_swipeDown02 != null) {
            return _swipeDown02!!
        }
        _swipeDown02 = ImageVector.Builder(
            name = "SwipeDown02",
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
        moveTo(18.5f, 8.00195f)
        verticalLineTo(2.00195f)
        moveTo(18.5f, 8.00195f)
        curveTo(17.7998f, 8.00195f, 16.4915f, 6.00765f, 16f, 5.50195f)
        moveTo(18.5f, 8.00195f)
        curveTo(19.2002f, 8.00195f, 20.5085f, 6.00765f, 21f, 5.50195f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.3913f, 21.998f)
        curveTo(15.3395f, 20.084f, 15.4684f, 19.8535f, 15.6052f, 19.4277f)
        curveTo(15.7419f, 19.002f, 16.6982f, 17.4665f, 17.0366f, 16.3695f)
        curveTo(18.1313f, 12.8202f, 17.111f, 12.0653f, 15.7507f, 11.0588f)
        curveTo(14.2422f, 9.94257f, 11.3968f, 9.37728f, 9.98573f, 9.49966f)
        verticalLineTo(3.7462f)
        curveTo(9.98573f, 2.78288f, 9.20481f, 2.00195f, 8.24148f, 2.00195f)
        curveTo(7.27816f, 2.00195f, 6.49723f, 2.78288f, 6.49723f, 3.7462f)
        verticalLineTo(9.96607f)
        moveTo(6.49774f, 21.9988f)
        verticalLineTo(20.9854f)
        curveTo(6.43328f, 20.041f, 5.49529f, 18.9235f, 4.32672f, 17.3166f)
        curveTo(3.12509f, 15.576f, 2.86688f, 14.6973f, 3.05591f, 13.8848f)
        curveTo(3.15329f, 13.4694f, 3.40594f, 12.7832f, 4.64647f, 11.6104f)
        lineTo(6.49723f, 9.96607f)
        moveTo(6.49723f, 14.0323f)
        verticalLineTo(9.96607f)
        }
        }.build()

        return _swipeDown02!!
    }

private var _swipeDown02: ImageVector? = null
