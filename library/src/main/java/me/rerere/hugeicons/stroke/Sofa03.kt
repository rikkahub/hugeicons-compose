package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sofa03: ImageVector
    get() {
        if (_sofa03 != null) {
            return _sofa03!!
        }
        _sofa03 = ImageVector.Builder(
            name = "Sofa03",
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
        moveTo(7f, 16f)
        verticalLineTo(19f)
        moveTo(17f, 16f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.9996f, 9.26828f)
        curveTo(20.043f, 8.716f, 18.8198f, 9.04375f, 18.2675f, 10.0003f)
        lineTo(17.2581f, 12.3892f)
        curveTo(17.0078f, 12.9815f, 16.9799f, 13f, 16.3369f, 13f)
        horizontalLineTo(7.66304f)
        curveTo(7.02008f, 13f, 6.99218f, 12.9815f, 6.74191f, 12.3893f)
        lineTo(5.73238f, 10.0003f)
        curveTo(5.1801f, 9.04375f, 3.95692f, 8.716f, 3.00033f, 9.26828f)
        curveTo(2.04375f, 9.82057f, 1.716f, 11.0437f, 2.26828f, 12.0003f)
        curveTo(2.69932f, 12.7469f, 3.89493f, 12.6838f, 4.08847f, 13.2646f)
        curveTo(4.5284f, 14.5848f, 4.74836f, 15.2449f, 5.27216f, 15.6224f)
        curveTo(5.79596f, 16f, 6.49175f, 16f, 7.88331f, 16f)
        horizontalLineTo(16.1166f)
        curveTo(17.5082f, 16f, 18.204f, 16f, 18.7278f, 15.6224f)
        curveTo(19.2516f, 15.2448f, 19.4716f, 14.5847f, 19.9115f, 13.2645f)
        curveTo(20.105f, 12.6838f, 21.3007f, 12.7468f, 21.7316f, 12.0003f)
        curveTo(22.2839f, 11.0437f, 21.9562f, 9.82057f, 20.9996f, 9.26828f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 9f)
        lineTo(4.54003f, 8.89326f)
        curveTo(5.24623f, 7.01005f, 5.59933f, 6.06845f, 6.37022f, 5.53422f)
        curveTo(7.1411f, 5f, 8.14674f, 5f, 10.158f, 5f)
        horizontalLineTo(13.842f)
        curveTo(15.8533f, 5f, 16.8589f, 5f, 17.6298f, 5.53422f)
        curveTo(18.4007f, 6.06845f, 18.7538f, 7.01005f, 19.46f, 8.89326f)
        lineTo(19.5f, 9f)
        }
        }.build()

        return _sofa03!!
    }

private var _sofa03: ImageVector? = null
