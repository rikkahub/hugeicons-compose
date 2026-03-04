package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.OrientationLandscapeToPotrait: ImageVector
    get() {
        if (_orientationLandscapeToPotrait != null) {
            return _orientationLandscapeToPotrait!!
        }
        _orientationLandscapeToPotrait = ImageVector.Builder(
            name = "OrientationLandscapeToPotrait",
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
        moveTo(12f, 9f)
        curveTo(12f, 6.64298f, 12f, 5.46447f, 11.2678f, 4.73223f)
        curveTo(10.5355f, 4f, 9.35702f, 4f, 7f, 4f)
        curveTo(4.64298f, 4f, 3.46447f, 4f, 2.73223f, 4.73223f)
        curveTo(2f, 5.46447f, 2f, 6.64298f, 2f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 22f)
        horizontalLineTo(15f)
        curveTo(17.357f, 22f, 18.5355f, 22f, 19.2678f, 21.2678f)
        curveTo(20f, 20.5355f, 20f, 19.357f, 20f, 17f)
        curveTo(20f, 14.643f, 20f, 13.4645f, 19.2678f, 12.7322f)
        curveTo(18.5355f, 12f, 17.357f, 12f, 15f, 12f)
        lineTo(7f, 12f)
        curveTo(4.64298f, 12f, 3.46446f, 12f, 2.73223f, 12.7322f)
        curveTo(2f, 13.4645f, 2f, 14.643f, 2f, 17f)
        curveTo(2f, 19.357f, 2f, 20.5355f, 2.73223f, 21.2678f)
        curveTo(3.46446f, 22f, 4.64298f, 22f, 7f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 2f)
        lineTo(16f, 4.5f)
        lineTo(18.5f, 7f)
        moveTo(17f, 4.5f)
        curveTo(19.357f, 4.5f, 20.5355f, 4.5f, 21.2678f, 5.23223f)
        curveTo(22f, 5.96447f, 22f, 7.14298f, 22f, 9.5f)
        }
        }.build()

        return _orientationLandscapeToPotrait!!
    }

private var _orientationLandscapeToPotrait: ImageVector? = null
