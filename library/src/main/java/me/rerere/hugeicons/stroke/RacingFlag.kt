package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RacingFlag: ImageVector
    get() {
        if (_racingFlag != null) {
            return _racingFlag!!
        }
        _racingFlag = ImageVector.Builder(
            name = "RacingFlag",
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
        moveTo(5.67181f, 13.9095f)
        curveTo(10f, 15.9322f, 14f, 7.84169f, 21f, 11.8869f)
        lineTo(18f, 2.78502f)
        curveTo(13.4239f, -0.299918f, 8.56286f, 6.85641f, 3f, 4.62523f)
        lineTo(8.00007f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 7.00073f)
        curveTo(13.5f, 3.00076f, 9f, 12.0007f, 4.5f, 9.00064f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 4.90476f)
        lineTo(10.8235f, 13f)
        moveTo(13.1765f, 3f)
        lineTo(16f, 10.619f)
        }
        }.build()

        return _racingFlag!!
    }

private var _racingFlag: ImageVector? = null
