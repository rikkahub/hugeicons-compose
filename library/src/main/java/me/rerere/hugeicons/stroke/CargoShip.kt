package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CargoShip: ImageVector
    get() {
        if (_cargoShip != null) {
            return _cargoShip!!
        }
        _cargoShip = ImageVector.Builder(
            name = "CargoShip",
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
        moveTo(2f, 21.494f)
        curveTo(3.2945f, 21.5899f, 4.38367f, 20.5f, 5.33333f, 20.5f)
        curveTo(6.283f, 20.5f, 7.82473f, 21.5053f, 8.66667f, 21.494f)
        curveTo(9.67699f, 21.5025f, 10.8604f, 20.5f, 12f, 20.5f)
        curveTo(13.1396f, 20.5f, 14.323f, 21.5025f, 15.3333f, 21.494f)
        curveTo(16.6278f, 21.5899f, 17.717f, 20.5f, 18.6667f, 20.5f)
        curveTo(19.6163f, 20.5f, 21.1581f, 21.5053f, 22f, 21.494f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 20.5f)
        curveTo(4.58214f, 18.7336f, 3.58286f, 16.4728f, 3.15734f, 15.2748f)
        curveTo(3.0224f, 14.8949f, 2.95494f, 14.705f, 3.03329f, 14.5234f)
        curveTo(3.11163f, 14.3419f, 3.30377f, 14.2568f, 3.68803f, 14.0866f)
        lineTo(11.1772f, 10.7692f)
        curveTo(11.5824f, 10.5897f, 11.785f, 10.5f, 12f, 10.5f)
        curveTo(12.215f, 10.5f, 12.4176f, 10.5897f, 12.8228f, 10.7692f)
        lineTo(20.312f, 14.0866f)
        curveTo(20.6962f, 14.2568f, 20.8884f, 14.3419f, 20.9667f, 14.5234f)
        curveTo(21.0451f, 14.705f, 20.9776f, 14.8949f, 20.8427f, 15.2748f)
        curveTo(20.4171f, 16.4728f, 19.4179f, 18.7336f, 18f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 13f)
        lineTo(6.21591f, 10.1932f)
        curveTo(6.35068f, 8.44115f, 6.41807f, 7.56511f, 6.99316f, 7.03256f)
        curveTo(7.56826f, 6.5f, 8.44688f, 6.5f, 10.2041f, 6.5f)
        horizontalLineTo(13.7959f)
        curveTo(15.5531f, 6.5f, 16.4317f, 6.5f, 17.0068f, 7.03256f)
        curveTo(17.5819f, 7.56511f, 17.6493f, 8.44115f, 17.7841f, 10.1932f)
        lineTo(18f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 6.5f)
        lineTo(8.67151f, 5.1279f)
        curveTo(8.82792f, 3.87661f, 8.90613f, 3.25097f, 9.33147f, 2.87548f)
        curveTo(9.75681f, 2.5f, 10.3873f, 2.5f, 11.6483f, 2.5f)
        horizontalLineTo(12.3517f)
        curveTo(13.6127f, 2.5f, 14.2432f, 2.5f, 14.6685f, 2.87548f)
        curveTo(15.0939f, 3.25097f, 15.1721f, 3.87661f, 15.3285f, 5.1279f)
        lineTo(15.5f, 6.5f)
        }
        }.build()

        return _cargoShip!!
    }

private var _cargoShip: ImageVector? = null
