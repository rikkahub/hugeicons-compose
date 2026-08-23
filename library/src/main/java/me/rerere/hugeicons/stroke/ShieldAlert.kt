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

val HugeIcons.ShieldAlert: ImageVector
    get() {
        if (_shieldAlert != null) {
            return _shieldAlert!!
        }
        _shieldAlert = ImageVector.Builder(
            name = "ShieldAlert",
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
            moveTo(11.9922f, 8f)
            lineTo(11.9922f, 12f)
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
            moveTo(12.1172f, 15.75f)
            lineTo(11.9922f, 15.75f)
            moveTo(12.2422f, 15.75f)
            curveTo(12.2422f, 15.8881f, 12.1303f, 16f, 11.9922f, 16f)
            curveTo(11.8541f, 16f, 11.7422f, 15.8881f, 11.7422f, 15.75f)
            curveTo(11.7422f, 15.6119f, 11.8541f, 15.5f, 11.9922f, 15.5f)
            curveTo(12.1303f, 15.5f, 12.2422f, 15.6119f, 12.2422f, 15.75f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20.9922f, 11.1835f)
            verticalLineTo(8.28041f)
            curveTo(20.9922f, 6.64041f, 20.9922f, 5.82041f, 20.5881f, 5.28541f)
            curveTo(20.184f, 4.75042f, 19.2703f, 4.49068f, 17.4429f, 3.97122f)
            curveTo(16.1944f, 3.61632f, 15.0938f, 3.18875f, 14.2145f, 2.79841f)
            curveTo(13.0156f, 2.26622f, 12.4161f, 2.00012f, 11.9922f, 2.00012f)
            curveTo(11.5682f, 2.00012f, 10.9688f, 2.26622f, 9.7699f, 2.79841f)
            curveTo(8.89057f, 3.18875f, 7.79002f, 3.61632f, 6.54152f, 3.97122f)
            curveTo(4.71411f, 4.49068f, 3.80041f, 4.75042f, 3.3963f, 5.28541f)
            curveTo(2.99219f, 5.82041f, 2.99219f, 6.64041f, 2.99219f, 8.28041f)
            verticalLineTo(11.1835f)
            curveTo(2.99219f, 16.8086f, 8.05496f, 20.1836f, 10.5861f, 21.5195f)
            curveTo(11.1932f, 21.8399f, 11.4968f, 22.0001f, 11.9922f, 22.0001f)
            curveTo(12.4876f, 22.0001f, 12.7911f, 21.8399f, 13.3982f, 21.5195f)
            curveTo(15.9294f, 20.1836f, 20.9922f, 16.8086f, 20.9922f, 11.1835f)
            close()
        }
        }.build()

        return _shieldAlert!!
    }

private var _shieldAlert: ImageVector? = null
