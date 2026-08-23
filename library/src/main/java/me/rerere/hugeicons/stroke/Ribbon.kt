package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ribbon: ImageVector
    get() {
        if (_ribbon != null) {
            return _ribbon!!
        }
        _ribbon = ImageVector.Builder(
            name = "Ribbon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9f, 6f)
            horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.51121f, 4.52456f)
            lineTo(11.8814f, 10f)
            moveTo(9.16281f, 13.2957f)
            lineTo(6.92336f, 10.3028f)
            curveTo(6.324f, 9.50178f, 6f, 8.52752f, 6f, 7.52625f)
            curveTo(6f, 6.87877f, 6.13556f, 6.23849f, 6.39791f, 5.64681f)
            lineTo(6.4329f, 5.56791f)
            curveTo(7.20073f, 3.83628f, 7.58464f, 2.97046f, 8.33058f, 2.48523f)
            curveTo(9.07653f, 2f, 10.0236f, 2f, 11.9179f, 2f)
            horizontalLineTo(12.0821f)
            curveTo(13.9764f, 2f, 14.9235f, 2f, 15.6694f, 2.48523f)
            curveTo(16.4154f, 2.97046f, 16.7993f, 3.83628f, 17.5671f, 5.56791f)
            lineTo(17.6021f, 5.64681f)
            curveTo(17.8644f, 6.23849f, 18f, 6.87877f, 18f, 7.52625f)
            curveTo(18f, 8.52752f, 17.676f, 9.50178f, 17.0766f, 10.3028f)
            lineTo(9.09578f, 20.9688f)
            curveTo(8.94448f, 21.171f, 8.86858f, 21.2724f, 8.80094f, 21.3462f)
            curveTo(8.03756f, 22.1797f, 6.74013f, 22.222f, 5.92425f, 21.4402f)
            curveTo(5.85193f, 21.3709f, 5.7698f, 21.2748f, 5.60553f, 21.0827f)
            curveTo(5.4918f, 20.9497f, 5.43474f, 20.883f, 5.38909f, 20.8205f)
            curveTo(4.88514f, 20.1305f, 4.86936f, 19.1971f, 5.3497f, 18.4904f)
            curveTo(5.39324f, 18.4264f, 5.44787f, 18.3579f, 5.55715f, 18.221f)
            lineTo(16.4888f, 4.52456f)
            moveTo(16.6702f, 16f)
            lineTo(18.4429f, 18.221f)
            curveTo(18.5521f, 18.3579f, 18.6068f, 18.4264f, 18.6503f, 18.4904f)
            curveTo(19.1306f, 19.1971f, 19.1149f, 20.1305f, 18.6109f, 20.8205f)
            curveTo(18.5653f, 20.883f, 18.5082f, 20.9497f, 18.3945f, 21.0827f)
            curveTo(18.2302f, 21.2748f, 18.1481f, 21.3709f, 18.0758f, 21.4402f)
            curveTo(17.2599f, 22.222f, 15.9624f, 22.1797f, 15.1991f, 21.3462f)
            curveTo(15.1314f, 21.2724f, 15.0556f, 21.1711f, 14.9042f, 20.9688f)
            lineTo(13.8052f, 19.5f)
        }
        }.build()

        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
