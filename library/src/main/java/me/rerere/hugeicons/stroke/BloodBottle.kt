package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BloodBottle: ImageVector
    get() {
        if (_bloodBottle != null) {
            return _bloodBottle!!
        }
        _bloodBottle = ImageVector.Builder(
            name = "BloodBottle",
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
        moveTo(14f, 5f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 2f)
        horizontalLineTo(9f)
        curveTo(6.64298f, 2f, 5.46447f, 2f, 4.73223f, 2.73223f)
        curveTo(4f, 3.46447f, 4f, 4.64298f, 4f, 7f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 11.125f)
        curveTo(8f, 8.66719f, 8f, 7.43829f, 8.57782f, 6.5555f)
        curveTo(8.82796f, 6.17334f, 9.14939f, 5.84521f, 9.52376f, 5.58986f)
        curveTo(10.3885f, 5f, 11.5924f, 5f, 14f, 5f)
        curveTo(16.4076f, 5f, 17.6115f, 5f, 18.4762f, 5.58986f)
        curveTo(18.8506f, 5.84521f, 19.172f, 6.17334f, 19.4222f, 6.5555f)
        curveTo(20f, 7.43829f, 20f, 8.66719f, 20f, 11.125f)
        verticalLineTo(12.875f)
        curveTo(20f, 15.3328f, 20f, 16.5617f, 19.4222f, 17.4445f)
        curveTo(19.172f, 17.8267f, 18.8506f, 18.1548f, 18.4762f, 18.4101f)
        curveTo(17.6115f, 19f, 16.4076f, 19f, 14f, 19f)
        curveTo(11.5924f, 19f, 10.3885f, 19f, 9.52376f, 18.4101f)
        curveTo(9.14939f, 18.1548f, 8.82796f, 17.8267f, 8.57782f, 17.4445f)
        curveTo(8f, 16.5617f, 8f, 15.3328f, 8f, 12.875f)
        verticalLineTo(11.125f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 10.3722f)
        curveTo(14.8571f, 6.24278f, 13.5714f, 13.0046f, 20f, 10.3723f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 22f)
        curveTo(12.6569f, 22f, 14f, 20.6569f, 14f, 19f)
        }
        }.build()

        return _bloodBottle!!
    }

private var _bloodBottle: ImageVector? = null
