package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Imo: ImageVector
    get() {
        if (_imo != null) {
            return _imo!!
        }
        _imo = ImageVector.Builder(
            name = "Imo",
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
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 13.8214f, 2.48697f, 15.5291f, 3.33782f, 17f)
        lineTo(2f, 22f)
        lineTo(7f, 20.6622f)
        curveTo(8.47087f, 21.513f, 10.1786f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.00859f, 9f)
        lineTo(7f, 9f)
        moveTo(7.00112f, 11f)
        verticalLineTo(15f)
        moveTo(8.91304f, 15f)
        verticalLineTo(12.25f)
        curveTo(8.91304f, 11.5596f, 9.44836f, 11f, 10.1087f, 11f)
        curveTo(10.769f, 11f, 11.3043f, 11.5596f, 11.3043f, 12.25f)
        moveTo(11.3043f, 12.25f)
        verticalLineTo(15f)
        moveTo(11.3043f, 12.25f)
        curveTo(11.3043f, 11.5596f, 11.8397f, 11f, 12.5f, 11f)
        curveTo(13.1603f, 11f, 13.6957f, 11.5596f, 13.6957f, 12.25f)
        verticalLineTo(15f)
        moveTo(15.6087f, 12.25f)
        verticalLineTo(13.75f)
        curveTo(15.6087f, 14.4404f, 16.144f, 15f, 16.8043f, 15f)
        curveTo(17.4647f, 15f, 18f, 14.4404f, 18f, 13.75f)
        verticalLineTo(12.25f)
        curveTo(18f, 11.5596f, 17.4647f, 11f, 16.8043f, 11f)
        curveTo(16.144f, 11f, 15.6087f, 11.5596f, 15.6087f, 12.25f)
        }
        }.build()

        return _imo!!
    }

private var _imo: ImageVector? = null
