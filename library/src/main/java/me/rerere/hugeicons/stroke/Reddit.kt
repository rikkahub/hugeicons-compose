package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Reddit: ImageVector
    get() {
        if (_reddit != null) {
            return _reddit!!
        }
        _reddit = ImageVector.Builder(
            name = "Reddit",
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
        moveTo(15.5f, 16.7803f)
        curveTo(14.5149f, 17.548f, 13.3062f, 18.0002f, 12f, 18.0002f)
        curveTo(10.6938f, 18.0002f, 9.48512f, 17.548f, 8.5f, 16.7803f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 10.0694f)
        curveTo(18.3687f, 9.43053f, 19.0634f, 9f, 19.8595f, 9f)
        curveTo(21.0417f, 9f, 22f, 9.94921f, 22f, 11.1201f)
        curveTo(22f, 11.937f, 21.5336f, 12.6459f, 20.8502f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 10.0694f)
        curveTo(5.63125f, 9.43053f, 4.93663f, 9f, 4.14048f, 9f)
        curveTo(2.95833f, 9f, 2f, 9.94921f, 2f, 11.1201f)
        curveTo(2f, 11.937f, 2.4664f, 12.6459f, 3.14981f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 4f)
        curveTo(14.643f, 4f, 13.4645f, 4f, 12.7322f, 4.73223f)
        curveTo(12f, 5.46447f, 12f, 6.64298f, 12f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.00801f, 13f)
        lineTo(8.99902f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.008f, 13f)
        lineTo(14.999f, 13f)
        }
        }.build()

        return _reddit!!
    }

private var _reddit: ImageVector? = null
