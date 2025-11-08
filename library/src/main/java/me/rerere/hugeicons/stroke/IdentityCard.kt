package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.IdentityCard: ImageVector
    get() {
        if (_identityCard != null) {
            return _identityCard!!
        }
        _identityCard = ImageVector.Builder(
            name = "IdentityCard",
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
        moveTo(14f, 3.5f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 3.5f, 4.34315f, 3.5f, 3.17157f, 4.67157f)
        curveTo(2f, 5.84315f, 2f, 7.72876f, 2f, 11.5f)
        verticalLineTo(12.5f)
        curveTo(2f, 16.2712f, 2f, 18.1569f, 3.17157f, 19.3284f)
        curveTo(4.34315f, 20.5f, 6.22876f, 20.5f, 10f, 20.5f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 20.5f, 19.6569f, 20.5f, 20.8284f, 19.3284f)
        curveTo(22f, 18.1569f, 22f, 16.2712f, 22f, 12.5f)
        verticalLineTo(11.5f)
        curveTo(22f, 7.72876f, 22f, 5.84315f, 20.8284f, 4.67157f)
        curveTo(19.6569f, 3.5f, 17.7712f, 3.5f, 14f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 16f)
        curveTo(6.03569f, 13.4189f, 9.89616f, 13.2491f, 11f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.75f, 9.75f)
        curveTo(9.75f, 10.7165f, 8.9665f, 11.5f, 8f, 11.5f)
        curveTo(7.0335f, 11.5f, 6.25f, 10.7165f, 6.25f, 9.75f)
        curveTo(6.25f, 8.7835f, 7.0335f, 8f, 8f, 8f)
        curveTo(8.9665f, 8f, 9.75f, 8.7835f, 9.75f, 9.75f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 8.5f)
        horizontalLineTo(19f)
        moveTo(14f, 12f)
        horizontalLineTo(19f)
        moveTo(14f, 15.5f)
        horizontalLineTo(16.5f)
        }
        }.build()

        return _identityCard!!
    }

private var _identityCard: ImageVector? = null
