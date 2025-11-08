package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bedug01: ImageVector
    get() {
        if (_bedug01 != null) {
            return _bedug01!!
        }
        _bedug01 = ImageVector.Builder(
            name = "Bedug01",
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
        moveTo(5f, 16f)
        curveTo(6.10457f, 16f, 7f, 12.866f, 7f, 9f)
        curveTo(7f, 5.13401f, 6.10457f, 2f, 5f, 2f)
        curveTo(3.89543f, 2f, 3f, 5.13401f, 3f, 9f)
        curveTo(3f, 12.866f, 3.89543f, 16f, 5f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 15.5f)
        lineTo(16f, 22f)
        moveTo(8f, 22f)
        lineTo(18f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 2f)
        lineTo(16.1103f, 3.58719f)
        curveTo(19.1126f, 4.01608f, 21f, 5.73626f, 21f, 9f)
        curveTo(21f, 11.0222f, 20.065f, 13.3797f, 18f, 14.0512f)
        moveTo(5f, 16f)
        lineTo(14.0942f, 14.7008f)
        moveTo(8.83195f, 2.54742f)
        curveTo(9.56585f, 4.09552f, 10.123f, 6.18217f, 10.0113f, 9.56933f)
        curveTo(9.93575f, 11.2861f, 9.68691f, 13.6615f, 8.85527f, 15.4492f)
        }
        }.build()

        return _bedug01!!
    }

private var _bedug01: ImageVector? = null
