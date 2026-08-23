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

val HugeIcons.ClipboardPen: ImageVector
    get() {
        if (_clipboardPen != null) {
            return _clipboardPen!!
        }
        _clipboardPen = ImageVector.Builder(
            name = "ClipboardPen",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.00002f, 4f)
            lineTo(7f, 4.99997f)
            curveTo(6.99998f, 5.94279f, 6.99998f, 6.4142f, 7.29287f, 6.7071f)
            curveTo(7.58577f, 7f, 8.05718f, 7f, 9f, 7f)
            lineTo(13f, 7f)
            curveTo(13.9428f, 7f, 14.4142f, 7f, 14.7071f, 6.70711f)
            curveTo(15f, 6.41421f, 15f, 5.94281f, 15f, 5f)
            verticalLineTo(4f)
        }

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
            moveTo(7.99583f, 22.7483f)
            curveTo(8.41003f, 22.7506f, 8.74768f, 22.4166f, 8.74999f, 22.0024f)
            curveTo(8.75229f, 21.5882f, 8.41838f, 21.2506f, 8.00417f, 21.2483f)
            lineTo(8f, 21.9983f)
            lineTo(7.99583f, 22.7483f)
            close()
            moveTo(3.87868f, 21.1213f)
            lineTo(4.40901f, 20.591f)
            lineTo(3.87868f, 21.1213f)
            close()
            moveTo(3.87868f, 4.87868f)
            lineTo(4.40901f, 5.40901f)
            verticalLineTo(5.40901f)
            lineTo(3.87868f, 4.87868f)
            close()
            moveTo(7f, 4.01732f)
            lineTo(6.99162f, 3.26737f)
            curveTo(6.98688f, 3.26742f, 6.98215f, 3.26752f, 6.97741f, 3.26766f)
            lineTo(7f, 4.01732f)
            close()
            moveTo(15f, 4.01732f)
            lineTo(15.0226f, 3.26766f)
            curveTo(15.0179f, 3.26752f, 15.0131f, 3.26742f, 15.0084f, 3.26737f)
            lineTo(15f, 4.01732f)
            close()
            moveTo(13.45f, 4f)
            lineTo(12.7149f, 4.1492f)
            curveTo(12.7853f, 4.49569f, 13.088f, 4.746f, 13.4416f, 4.74995f)
            lineTo(13.45f, 4f)
            close()
            moveTo(8.54997f, 4f)
            lineTo(8.55835f, 4.74995f)
            curveTo(8.91188f, 4.746f, 9.21465f, 4.49569f, 9.28498f, 4.1492f)
            lineTo(8.54997f, 4f)
            close()
            moveTo(18.2483f, 9.00417f)
            curveTo(18.2506f, 9.41838f, 18.5882f, 9.75229f, 19.0024f, 9.74999f)
            curveTo(19.4166f, 9.74768f, 19.7506f, 9.41003f, 19.7483f, 8.99583f)
            lineTo(18.9983f, 9f)
            lineTo(18.2483f, 9.00417f)
            close()
            moveTo(18.1213f, 4.87868f)
            lineTo(18.6517f, 4.34835f)
            lineTo(18.6517f, 4.34835f)
            lineTo(18.1213f, 4.87868f)
            close()
            moveTo(8f, 21.9983f)
            lineTo(8.00417f, 21.2483f)
            curveTo(6.91068f, 21.2422f, 6.13559f, 21.2138f, 5.54735f, 21.1057f)
            curveTo(4.98054f, 21.0016f, 4.65246f, 20.8344f, 4.40901f, 20.591f)
            lineTo(3.87868f, 21.1213f)
            lineTo(3.34835f, 21.6517f)
            curveTo(3.87328f, 22.1766f, 4.51835f, 22.4418f, 5.27635f, 22.5811f)
            curveTo(6.01291f, 22.7164f, 6.9143f, 22.7422f, 7.99583f, 22.7483f)
            lineTo(8f, 21.9983f)
            close()
            moveTo(3f, 16f)
            horizontalLineTo(2.25f)
            curveTo(2.25f, 17.393f, 2.24841f, 18.5132f, 2.36652f, 19.3918f)
            curveTo(2.48754f, 20.2919f, 2.74643f, 21.0497f, 3.34835f, 21.6517f)
            lineTo(3.87868f, 21.1213f)
            lineTo(4.40901f, 20.591f)
            curveTo(4.13225f, 20.3142f, 3.9518f, 19.9257f, 3.85315f, 19.1919f)
            curveTo(3.75159f, 18.4365f, 3.75f, 17.4354f, 3.75f, 16f)
            horizontalLineTo(3f)
            close()
            moveTo(3f, 10f)
            horizontalLineTo(2.25f)
            verticalLineTo(16f)
            horizontalLineTo(3f)
            horizontalLineTo(3.75f)
            verticalLineTo(10f)
            horizontalLineTo(3f)
            close()
            moveTo(3f, 10f)
            horizontalLineTo(3.75f)
            curveTo(3.75f, 8.56458f, 3.75159f, 7.56347f, 3.85315f, 6.80812f)
            curveTo(3.9518f, 6.07435f, 4.13225f, 5.68577f, 4.40901f, 5.40901f)
            lineTo(3.87868f, 4.87868f)
            lineTo(3.34835f, 4.34835f)
            curveTo(2.74643f, 4.95027f, 2.48754f, 5.70814f, 2.36652f, 6.60825f)
            curveTo(2.24841f, 7.48678f, 2.25f, 8.60699f, 2.25f, 10f)
            horizontalLineTo(3f)
            close()
            moveTo(7f, 4.01732f)
            lineTo(6.97741f, 3.26766f)
            curveTo(5.43521f, 3.31413f, 4.22037f, 3.47633f, 3.34835f, 4.34835f)
            lineTo(3.87868f, 4.87868f)
            lineTo(4.40901f, 5.40901f)
            curveTo(4.8196f, 4.99842f, 5.4579f, 4.81413f, 7.02259f, 4.76698f)
            lineTo(7f, 4.01732f)
            close()
            moveTo(15f, 4.01732f)
            lineTo(15.0084f, 3.26737f)
            lineTo(13.4583f, 3.25005f)
            lineTo(13.45f, 4f)
            lineTo(13.4416f, 4.74995f)
            lineTo(14.9916f, 4.76728f)
            lineTo(15f, 4.01732f)
            close()
            moveTo(11f, 2f)
            verticalLineTo(1.25f)
            curveTo(9.42676f, 1.25f, 8.11615f, 2.36703f, 7.81496f, 3.8508f)
            lineTo(8.54997f, 4f)
            lineTo(9.28498f, 4.1492f)
            curveTo(9.44706f, 3.35073f, 10.1542f, 2.75f, 11f, 2.75f)
            verticalLineTo(2f)
            close()
            moveTo(18.9983f, 9f)
            lineTo(19.7483f, 8.99583f)
            curveTo(19.7422f, 7.9143f, 19.7163f, 7.01291f, 19.5811f, 6.27635f)
            curveTo(19.4418f, 5.51835f, 19.1766f, 4.87328f, 18.6517f, 4.34835f)
            lineTo(18.1213f, 4.87868f)
            lineTo(17.591f, 5.40901f)
            curveTo(17.8344f, 5.65246f, 18.0016f, 5.98054f, 18.1057f, 6.54735f)
            curveTo(18.2138f, 7.13559f, 18.2422f, 7.91068f, 18.2483f, 9.00417f)
            lineTo(18.9983f, 9f)
            close()
            moveTo(15f, 4.01732f)
            lineTo(14.9774f, 4.76698f)
            curveTo(16.5421f, 4.81413f, 17.1804f, 4.99842f, 17.591f, 5.40901f)
            lineTo(18.1213f, 4.87868f)
            lineTo(18.6517f, 4.34835f)
            curveTo(17.7796f, 3.47633f, 16.5648f, 3.31413f, 15.0226f, 3.26766f)
            lineTo(15f, 4.01732f)
            close()
            moveTo(7f, 4.01732f)
            lineTo(7.00838f, 4.76728f)
            lineTo(8.55835f, 4.74995f)
            lineTo(8.54997f, 4f)
            lineTo(8.54159f, 3.25005f)
            lineTo(6.99162f, 3.26737f)
            lineTo(7f, 4.01732f)
            close()
            moveTo(13.45f, 4f)
            lineTo(14.185f, 3.8508f)
            curveTo(13.8838f, 2.36703f, 12.5732f, 1.25f, 11f, 1.25f)
            verticalLineTo(2f)
            verticalLineTo(2.75f)
            curveTo(11.8457f, 2.75f, 12.5529f, 3.35073f, 12.7149f, 4.1492f)
            lineTo(13.45f, 4f)
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
            moveTo(12f, 22f)
            verticalLineTo(20.4937f)
            curveTo(12f, 19.8117f, 12.2709f, 19.1576f, 12.7532f, 18.6754f)
            lineTo(17.974f, 13.4546f)
            curveTo(18.2651f, 13.1635f, 18.6598f, 13f, 19.0714f, 13f)
            curveTo(19.483f, 13f, 19.8778f, 13.1635f, 20.1689f, 13.4546f)
            lineTo(20.5454f, 13.8311f)
            curveTo(20.8365f, 14.1222f, 21f, 14.517f, 21f, 14.9286f)
            curveTo(21f, 15.3402f, 20.8365f, 15.7349f, 20.5454f, 16.026f)
            lineTo(15.3246f, 21.2468f)
            curveTo(14.8423f, 21.7291f, 14.1883f, 22f, 13.5063f, 22f)
            horizontalLineTo(12f)
            close()
        }
        }.build()

        return _clipboardPen!!
    }

private var _clipboardPen: ImageVector? = null
