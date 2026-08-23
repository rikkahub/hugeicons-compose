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

val HugeIcons.Baseline: ImageVector
    get() {
        if (_baseline != null) {
            return _baseline!!
        }
        _baseline = ImageVector.Builder(
            name = "Baseline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = SolidColor(Color(0xFF141B34)),
            stroke = null,
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5.315f, 15.6946f)
            curveTo(5.14633f, 16.0729f, 5.31628f, 16.5163f, 5.6946f, 16.685f)
            curveTo(6.07291f, 16.8537f, 6.51633f, 16.6837f, 6.685f, 16.3054f)
            lineTo(6f, 16f)
            lineTo(5.315f, 15.6946f)
            close()
            moveTo(10.1724f, 6.64162f)
            lineTo(9.48737f, 6.33622f)
            verticalLineTo(6.33622f)
            lineTo(10.1724f, 6.64162f)
            close()
            moveTo(13.8276f, 6.64162f)
            lineTo(13.1426f, 6.94702f)
            verticalLineTo(6.94702f)
            lineTo(13.8276f, 6.64162f)
            close()
            moveTo(17.315f, 16.3054f)
            curveTo(17.4837f, 16.6837f, 17.9271f, 16.8537f, 18.3054f, 16.685f)
            curveTo(18.6837f, 16.5163f, 18.8537f, 16.0729f, 18.685f, 15.6946f)
            lineTo(18f, 16f)
            lineTo(17.315f, 16.3054f)
            close()
            moveTo(8f, 11.25f)
            curveTo(7.58579f, 11.25f, 7.25f, 11.5858f, 7.25f, 12f)
            curveTo(7.25f, 12.4142f, 7.58579f, 12.75f, 8f, 12.75f)
            verticalLineTo(12f)
            verticalLineTo(11.25f)
            close()
            moveTo(16f, 12.75f)
            curveTo(16.4142f, 12.75f, 16.75f, 12.4142f, 16.75f, 12f)
            curveTo(16.75f, 11.5858f, 16.4142f, 11.25f, 16f, 11.25f)
            verticalLineTo(12f)
            verticalLineTo(12.75f)
            close()
            moveTo(6f, 16f)
            lineTo(6.685f, 16.3054f)
            lineTo(10.8574f, 6.94702f)
            lineTo(10.1724f, 6.64162f)
            lineTo(9.48737f, 6.33622f)
            lineTo(5.315f, 15.6946f)
            lineTo(6f, 16f)
            close()
            moveTo(13.8276f, 6.64162f)
            lineTo(13.1426f, 6.94702f)
            lineTo(17.315f, 16.3054f)
            lineTo(18f, 16f)
            lineTo(18.685f, 15.6946f)
            lineTo(14.5126f, 6.33622f)
            lineTo(13.8276f, 6.64162f)
            close()
            moveTo(10.1724f, 6.64162f)
            lineTo(10.8574f, 6.94702f)
            curveTo(11.2603f, 6.04328f, 11.5297f, 5.44382f, 11.7714f, 5.06034f)
            curveTo(12.0231f, 4.66106f, 12.0885f, 4.75f, 12f, 4.75f)
            verticalLineTo(4f)
            verticalLineTo(3.25f)
            curveTo(11.2616f, 3.25f, 10.8058f, 3.77921f, 10.5025f, 4.26047f)
            curveTo(10.1891f, 4.75753f, 9.86961f, 5.47888f, 9.48737f, 6.33622f)
            lineTo(10.1724f, 6.64162f)
            close()
            moveTo(13.8276f, 6.64162f)
            lineTo(14.5126f, 6.33622f)
            curveTo(14.1304f, 5.47888f, 13.8109f, 4.75753f, 13.4975f, 4.26047f)
            curveTo(13.1942f, 3.77921f, 12.7384f, 3.25f, 12f, 3.25f)
            verticalLineTo(4f)
            verticalLineTo(4.75f)
            curveTo(11.9115f, 4.75f, 11.9769f, 4.66106f, 12.2286f, 5.06034f)
            curveTo(12.4703f, 5.44382f, 12.7397f, 6.04328f, 13.1426f, 6.94702f)
            lineTo(13.8276f, 6.64162f)
            close()
            moveTo(8f, 12f)
            verticalLineTo(12.75f)
            horizontalLineTo(16f)
            verticalLineTo(12f)
            verticalLineTo(11.25f)
            horizontalLineTo(8f)
            verticalLineTo(12f)
            close()
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
            moveTo(4f, 20f)
            horizontalLineTo(20f)
        }
        }.build()

        return _baseline!!
    }

private var _baseline: ImageVector? = null
