package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Clothes: ImageVector
    get() {
        if (_clothes != null) {
            return _clothes!!
        }
        _clothes = ImageVector.Builder(
            name = "Clothes",
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
        moveTo(17.0032f, 2.55556f)
        lineTo(14.5016f, 2f)
        curveTo(14.0013f, 3f, 13.0006f, 3.5f, 12f, 3.5f)
        curveTo(10.9994f, 3.5f, 9.99871f, 3f, 9.49839f, 2f)
        lineTo(6.99678f, 2.55556f)
        moveTo(17.0032f, 2.55556f)
        lineTo(17.4345f, 2.65134f)
        curveTo(18.442f, 2.87509f, 19.3482f, 3.4731f, 19.7132f, 4.43787f)
        curveTo(20.3752f, 6.18796f, 20.9185f, 8.98395f, 20.9962f, 12.9991f)
        curveTo(21.0053f, 13.4665f, 21.0098f, 13.7002f, 20.8627f, 13.8501f)
        curveTo(20.7156f, 14f, 20.4788f, 14f, 20.0052f, 14f)
        horizontalLineTo(17.966f)
        moveTo(17.0032f, 2.55556f)
        curveTo(17.0032f, 4.86557f, 17.2187f, 8.87061f, 17.966f, 14f)
        moveTo(17.966f, 14f)
        curveTo(18.1099f, 14.9879f, 18.3937f, 16.6177f, 18.6283f, 17.9295f)
        curveTo(18.8053f, 18.9196f, 18.8938f, 19.4146f, 18.5583f, 20.0311f)
        curveTo(18.2227f, 20.6476f, 17.8839f, 20.7899f, 17.2062f, 21.0744f)
        curveTo(16.0771f, 21.5484f, 14.3775f, 22f, 12f, 22f)
        curveTo(9.62254f, 22f, 7.92293f, 21.5484f, 6.79378f, 21.0744f)
        curveTo(6.11609f, 20.7899f, 5.77725f, 20.6476f, 5.44171f, 20.0311f)
        curveTo(5.10617f, 19.4146f, 5.19469f, 18.9196f, 5.37173f, 17.9295f)
        curveTo(5.60631f, 16.6177f, 5.89007f, 14.9879f, 6.034f, 14f)
        moveTo(6.99678f, 2.55556f)
        lineTo(6.56545f, 2.65134f)
        curveTo(5.55795f, 2.87509f, 4.6518f, 3.4731f, 4.28683f, 4.43787f)
        curveTo(3.62477f, 6.18796f, 3.08153f, 8.98395f, 3.00375f, 12.9991f)
        curveTo(2.9947f, 13.4665f, 2.99017f, 13.7002f, 3.13728f, 13.8501f)
        curveTo(3.28438f, 14f, 3.5212f, 14f, 3.99484f, 14f)
        horizontalLineTo(6.034f)
        moveTo(6.99678f, 2.55556f)
        curveTo(6.99678f, 4.86557f, 6.78127f, 8.87061f, 6.034f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.031f, 3f)
        curveTo(13.884f, 6.47826f, 14.1192f, 13.7478f, 18f, 15f)
        moveTo(9.96919f, 3f)
        curveTo(10.1162f, 6.47826f, 9.88048f, 13.7478f, 6f, 15f)
        }
        }.build()

        return _clothes!!
    }

private var _clothes: ImageVector? = null
