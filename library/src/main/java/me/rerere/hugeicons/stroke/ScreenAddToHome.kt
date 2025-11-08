package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ScreenAddToHome: ImageVector
    get() {
        if (_screenAddToHome != null) {
            return _screenAddToHome!!
        }
        _screenAddToHome = ImageVector.Builder(
            name = "ScreenAddToHome",
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
        moveTo(13.5f, 19f)
        horizontalLineTo(13.51f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 17f)
        curveTo(7f, 19.357f, 7f, 20.5355f, 7.73223f, 21.2678f)
        curveTo(8.46447f, 22f, 9.64298f, 22f, 12f, 22f)
        horizontalLineTo(15f)
        curveTo(17.357f, 22f, 18.5355f, 22f, 19.2678f, 21.2678f)
        curveTo(20f, 20.5355f, 20f, 19.357f, 20f, 17f)
        verticalLineTo(7f)
        curveTo(20f, 4.64298f, 20f, 3.46447f, 19.2678f, 2.73223f)
        curveTo(18.5355f, 2f, 17.357f, 2f, 15f, 2f)
        horizontalLineTo(12f)
        curveTo(9.64298f, 2f, 8.46447f, 2f, 7.73223f, 2.73223f)
        curveTo(7.11182f, 3.35264f, 7.01708f, 4.29344f, 7.00261f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 9f)
        horizontalLineTo(11f)
        verticalLineTo(14f)
        moveTo(10.5f, 9.5f)
        lineTo(4f, 16f)
        }
        }.build()

        return _screenAddToHome!!
    }

private var _screenAddToHome: ImageVector? = null
