package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CoinsDollar: ImageVector
    get() {
        if (_coinsDollar != null) {
            return _coinsDollar!!
        }
        _coinsDollar = ImageVector.Builder(
            name = "CoinsDollar",
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
        moveTo(14f, 18f)
        curveTo(18.4183f, 18f, 22f, 14.4183f, 22f, 10f)
        curveTo(22f, 5.58172f, 18.4183f, 2f, 14f, 2f)
        curveTo(9.58172f, 2f, 6f, 5.58172f, 6f, 10f)
        curveTo(6f, 14.4183f, 9.58172f, 18f, 14f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.15657f, 11f)
        curveTo(2.42523f, 12.1176f, 2f, 13.4535f, 2f, 14.8888f)
        curveTo(2f, 18.8162f, 5.18378f, 22f, 9.11116f, 22f)
        curveTo(10.5465f, 22f, 11.8824f, 21.5748f, 13f, 20.8434f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.7712f, 8.20524f)
        curveTo(15.555f, 7.29311f, 14.4546f, 6.47004f, 13.1337f, 7.08579f)
        curveTo(11.8128f, 7.70154f, 11.603f, 9.68269f, 13.601f, 9.89315f)
        curveTo(14.5041f, 9.98828f, 15.0928f, 9.78277f, 15.6319f, 10.3641f)
        curveTo(16.1709f, 10.9454f, 16.2711f, 12.562f, 14.8931f, 12.9977f)
        curveTo(13.5151f, 13.4334f, 12.1506f, 12.7526f, 12.002f, 11.786f)
        moveTo(13.9862f, 6.00421f)
        verticalLineTo(6.87325f)
        moveTo(13.9862f, 13.1318f)
        verticalLineTo(14.0042f)
        }
        }.build()

        return _coinsDollar!!
    }

private var _coinsDollar: ImageVector? = null
